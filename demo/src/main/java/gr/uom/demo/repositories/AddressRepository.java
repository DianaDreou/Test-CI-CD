package gr.uom.demo.repositories;

import gr.uom.demo.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

    //ToDo
    //getStudentWithAddressName
}
