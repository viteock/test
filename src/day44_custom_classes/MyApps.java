
package day44_custom_classes;

/**
 * This class is used to create objects of App class
 */
public class MyApps {
    public static void main(String[] args) {
        //String app1 = "uber"; this is string object. just characters
        App uberApp = new App(); //creating new object
        //opening Uber app - version = 3.5
        uberApp.name = "Uber";
        uberApp.version = 3.5;
        uberApp.open(); //call open method using object variable

        uberApp.version = 4.0;
        uberApp.open(); //open new version

        /**
         * create more objects and practice
         *
         */


    }
}

//package day44_custom_classes;
//
//import day44_custom_classes.App;
//
//public class MyApps {
//    public static void main(String[] args) {
//        App application = new App();
//        application.name = "Uber";
//        application.version = 2.1;
//        application.open();
//        application.open("wellsFargo", 6.9);
//    }
//}