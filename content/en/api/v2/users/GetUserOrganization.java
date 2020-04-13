import com.datadog.api.v2.client.api.UsersApi;

public class UsersApiExample {

    public static void main(String[] args) {
        UsersApi apiInstance = new UsersApi();
        String userId = userId_example; // String | The ID of the user.
        try {
            UserResponsePayload result = apiInstance.getUserOrganization(userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#getUserOrganization");
            e.printStackTrace();
        }
    }
}