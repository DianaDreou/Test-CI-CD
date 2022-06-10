package gr.uom.demo.controllers;

import gr.uom.demo.models.Address;
import gr.uom.demo.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping("/address")
    public String createAddress (@RequestBody Address address){
        addressService.createAddress(address);
        return "Address Created";
    }

    @GetMapping("/address")
    public List<Address> getAddress(){
        return addressService.getAddresses();
    }

}
