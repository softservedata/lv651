package HW04.HomeTasks;

public enum HTTPError {
    BAD_REQUEST (400,"Bad Request"),
    UNAUTHORIZED(401,"Unauthorized"),
    PAYMENT_REQUIRED(402,"Payment Required"),
    FORBIDDEN(403,"Forbidden"),
    NOT_FOUND(404,"Not Found"),
    METHOD_NOT_ALLOWED(405,"Method Not Allowed"),
    NOT_ACCEPTABLE(406,"Not Acceptable"),
    PROXY_AUTHENTICATION_REQUIRED(407,"Proxy Authentication Required");

    private final int errorNumber;
    private final String description;

    private static final HTTPError[] httpErrors = HTTPError.values();

    HTTPError(int errorNumber, String description) {
        this.errorNumber = errorNumber;
        this.description = description;
    }

    public int getErrorNumber() {
        return errorNumber;
    }

    public String getDescription() {
        return description;
    }

    public static String getDescriptionByErrorNumber(int errorNumber) {
        String result = "Error number not recognized";
        for (int i = 0; i < httpErrors.length; i++) {
            if (httpErrors[i].errorNumber==errorNumber) {
                result = httpErrors[i].description;
                break;
            }
        }
        return result;
    }
}
