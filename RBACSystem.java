import java.util.*;

public class RBACSystem {

    private static final Map<String, Set<String>> rolePermissions =
            new HashMap<>();

    private static final Map<String, String> userRoles =
            new HashMap<>();

    public static void main(String[] args) {

        // Define permissions for Admin
        rolePermissions.put("Admin", new HashSet<>(
                Arrays.asList("Create", "View", "Update", "Delete")
        ));

        // Define permissions for Manager
        rolePermissions.put("Manager", new HashSet<>(
                Arrays.asList("View", "Update")
        ));

        // Define permissions for Customer
        rolePermissions.put("Customer", new HashSet<>(
                Arrays.asList("View")
        ));

        // Assign users to roles
        assignRole("Mahmoud", "Admin");
        assignRole("Ahmed", "Manager");
        assignRole("Omar", "Customer");

        System.out.println("\n===== RBAC System =====");

        // Test Admin permissions
        checkAccess("Mahmoud", "Create");
        checkAccess("Mahmoud", "Delete");

        // Test Manager permissions
        checkAccess("Ahmed", "View");
        checkAccess("Ahmed", "Update");
        checkAccess("Ahmed", "Delete");

        // Test Customer permissions
        checkAccess("Omar", "View");
        checkAccess("Omar", "Update");

        // Display all roles and permissions
        displayRoles();
    }

    // Assign a role to a user
    public static void assignRole(String username, String role) {

        if (!rolePermissions.containsKey(role)) {
            System.out.println("Invalid role: " + role);
            return;
        }

        userRoles.put(username, role);

        System.out.println(
                "User " + username +
                        " assigned to role " + role
        );
    }

    // Check user access permission
    public static void checkAccess(String username, String permission) {

        String role = userRoles.get(username);

        if (role == null) {
            System.out.println(
                    "Access Denied: User " + username + " has no role."
            );
            return;
        }

        Set<String> permissions = rolePermissions.get(role);

        if (permissions.contains(permission)) {

            System.out.println(
                    "Access Granted: " + username +
                            " can " + permission + " accounts."
            );

        } else {

            System.out.println(
                    "Access Denied: " + username +
                            " cannot " + permission + " accounts."
            );
        }
    }

    // Display all roles and their permissions
    public static void displayRoles() {

        System.out.println("\n===== Roles and Permissions =====");

        for (String role : rolePermissions.keySet()) {

            System.out.println(
                    role + " : " + rolePermissions.get(role)
            );
        }
    }
}
