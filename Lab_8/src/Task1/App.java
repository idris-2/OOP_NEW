package Task1;
import java.lang.annotation.*;

/*
Create a custom access control mechanism for a messaging system where users can send messages to each other. The goal is to implement 
this control through a set of custom annotations. The first annotation, @CanSendMessage, should be applied to methods that grant users 
the ability to send messages. The second annotation, @RequiresPermission, is intended for use on classes or methods and specifies the 
necessary permission level a user must possess to send messages. Lastly, the @UserPermission annotation is designed to be applied to 
the User and Admin class, allowing the definition of specific permission levels for admins. The user class has an attribute username 
and represents users in the messaging system. The Admin class has also attribute username and represents admin in the messaging system.

The MessagingSystem class demonstrates the usage of the custom annotations.	You should implement a sendMessage method that prints which
user sent a message if the user is admin, and if it is a regular user then it should print a message that the user is restricted. You 
should also apply the already created custom annotations to it. In the main method inside the MessagingSystem class, demonstrate the 
usage of the sendMessage method by creating instances of users with different permission levels. Print the results to showcase how 
the implemented annotations enforce or allow message sending based on the specified permission levels.
*/

// Custom annotation for specifying the permission level required to send messages
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@interface RequiresPermission {
    int value() default 1; // Default permission level
}

// Custom annotation for marking methods that grant users the ability to send messages
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CanSendMessage {
}

// Custom annotation for defining permission levels for users and admins
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface UserPermission {
    int value() default 1; // Default permission level
}

// Represents a user in the messaging system
@UserPermission(1) // Default permission level for regular users
class User {
    String username;

    public User(String username) {
        this.username = username;
    }
}

// Represents an admin in the messaging system
@UserPermission(2) // Default permission level for admins
class Admin {
    String username;

    public Admin(String username) {
        this.username = username;
    }
}

// Represents the messaging system
class MessagingSystem {

    // Method to send a message, annotated with custom annotations
    @CanSendMessage
    @RequiresPermission(1) // Regular users must have at least permission level 1 to send messages
    public static void sendMessage(User user, String message) {
        System.out.println("Message sent by: " + user.username);
    }

    @CanSendMessage
    @RequiresPermission(2) // Admins must have at least permission level 2 to send messages
    public static void sendMessage(Admin admin, String message) {
        System.out.println("Message sent by admin: " + admin.username);
    }
}

public class App {
    public static void main(String[] args) {
        // Demonstrate the usage of sendMessage method with different users

        // Regular user with permission level 1
        User regularUser = new User("John");
        MessagingSystem.sendMessage(regularUser, "Hello Regular User"); // This should print the user's name

        // Admin with permission level 2
        Admin adminUser = new Admin("Admin123");
        MessagingSystem.sendMessage(adminUser, "Important Announcement"); // This should print the admin's name

        // Another regular user with permission level 1
        User anotherUser = new User("Alice");
        MessagingSystem.sendMessage(anotherUser, "Restricted Message"); // This should print the user's name
    }
}
