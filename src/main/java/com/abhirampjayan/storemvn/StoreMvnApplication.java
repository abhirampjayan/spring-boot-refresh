package com.abhirampjayan.storemvn;

import com.abhirampjayan.storemvn.entities.Address;
import com.abhirampjayan.storemvn.entities.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreMvnApplication {
    public static void main(String[] args) {
//        SpringApplication.run(StoreMvnApplication.class, args);

        Address address = Address.builder().state("kerala").pincode("567489").city("Bewe").build();

        User user = User.builder().id(1L).name("Kala").password("1234").build();

        user.addAddress(address);
        System.out.println(user);
    }


}
