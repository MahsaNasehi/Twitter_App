import java.io.Serializable;

public enum ResponseOrErrorType implements Serializable {
    SUCCESSFUL,
    DUPLICATE_USERNAME,
    DUPLICATE_ACCOUNTNAME,
    DUPLICATE_EMAIL,
    INVALID_EMAIL,
    INVALID_DATEFORMAT,
    INVALID_LINK,
    INVALID_EMAILFORMAT,
    DUPLICATE_PHONENUMBER,
    USER_NOTFOUND,
    OUT_OF_BOUND_LENGTH,
    INVALID_PASS,
    NOT_EQUALPASSANDREPITITION,
    ALREADY_EXISTS,
    ALREADY_ONLINE,
    LOWERCASE,
    UPPERCASE,
    UNSUCCESSFUL,

}