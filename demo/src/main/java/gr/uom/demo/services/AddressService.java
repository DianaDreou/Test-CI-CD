package gr.uom.demo.services;

import gr.uom.demo.models.Address;
import gr.uom.demo.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Access;
import java.util.List;
import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    AddressRepository addressRepository;

    public void createAddress(Address address) {
     //   Optional<Address> addressOptional =
        addressRepository.save(address);


    }

    public List<Address> getAddresses (){
        return addressRepository.findAll();
    }

}
