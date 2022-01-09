package com.tripleace.Tutorial.mapper;

import com.tripleace.Tutorial.entity.AddressEntity;
import com.tripleace.Tutorial.models.Address;
import org.springframework.stereotype.Component;

@Component
public class AddressMapper {
    public AddressEntity convertModelToEntity(Address address)
    {
        if(null == address){
            return null;
        }
        AddressEntity addressEntity =new AddressEntity();
        addressEntity.setAddress1(addressEntity.getAddress1());
        addressEntity.setAddress2(addressEntity.getAddress2());
        addressEntity.setState(address.getState());
        addressEntity.setCountry((address.getCountry()));
        return addressEntity;
    }

    public Address convertEntityToModel(AddressEntity addressEntity) {
        if(null == addressEntity){
            return null;
        }
        Address addressModel =new Address();
        addressModel.setAddress1(addressEntity.getAddress1());
        addressModel.setAddress2(addressEntity.getAddress2());
        addressModel.setState(addressEntity.getState());
        addressModel.setCountry((addressEntity.getCountry()));
        return addressModel;
    }
}
