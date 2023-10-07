package monero.lwc.schema.error;

public class ObjectError extends BaseError {
    public String field;
    public String details;

    public ObjectError(String field, String details)
    {
        this.field = field;
        this.details = details;
    }
}
