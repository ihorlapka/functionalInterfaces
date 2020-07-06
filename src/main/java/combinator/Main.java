package combinator;

import java.time.LocalDate;

import static combinator.CustomerRegistrationValidator.*;

public class Main {
    public static void main(String[] args) {
    
        Customer customer = new Customer(
                "Alice",
                "alice@gmail.com",
                "+01236544789",
                LocalDate.of(2000, 1, 9)
        );
    
//        System.out.println(new CustomerValidatorService().isValid(customer));
        
        //Using combinator pattern
    
        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAdult())
                .apply(customer);
    
        System.out.println(result);
        
        if (result != ValidationResult.SUCCESS) {
            throw new IllegalStateException(result.name());
        }
    }
}
