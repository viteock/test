package replit._2_Statements;

public class HTTP {
    public static void main(String[] args) {
        int status = 201;

        //copy from
        switch (status) {
            case 200:
                System.out.print("OK");
                break;
            case 201:
                System.out.print("Created");
                break;
            case 202:
                System.out.print("Accepted");
                break;
            case 301:
                System.out.print("Moved Permanently");
                break;
            case 303:
                System.out.print("See Other");
                break;
            case 304:
                System.out.print("Not Modified");
                break;
            case 307:
                System.out.print("Temporary Redirect");
                break;
            case 400:
                System.out.print("Bad Request");
                break;
            case 401:
                System.out.print("Unauthorized");
                break;
            case 403:
                System.out.print("Forbidden");
                break;
            case 404:
                System.out.print("Not Found");
                break;
            case 410:
                System.out.print("Gone");
                break;
            case 500:
                System.out.print("Internal Server Error");
                break;
            case 503:
                System.out.print("Service Unavailable");
                break;
            default:
                System.out.print("Invalid status code!");
        }
    }
}
