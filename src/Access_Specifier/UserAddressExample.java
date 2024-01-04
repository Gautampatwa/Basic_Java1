package Access_Specifier;
import Day1.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserAddressExample {
    public static void main(String[] args) {
        // Create a HashMap with user names as keys and addresses as values
        Map<String, Employee> userAddressMap = new HashMap<>();
        userAddressMap.put("User1",new Employee(2,3l));
        userAddressMap.put("User2",new Employee(2,3l));
        userAddressMap.put("User3", new Employee(2,3l));

        List<Employee> addressList = new ArrayList<>();
        for (Employee address : userAddressMap.values()) {
            addressList.add(address);
        }
        // Print or process the address list as needed
        //Implement toString methods in POJO
        System.out.println("Address List: " + addressList);
    }

}
