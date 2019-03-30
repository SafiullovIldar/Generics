package converter.impl;

import converter.Converter;
import dto.AddressDTO;
import entity.Address;

public class AddressDtoToAddress implements Converter<Address, AddressDTO> {

    @Override
    public Address convert(AddressDTO addressDTO) {
        return new Address(addressDTO.getCity(),
                            addressDTO.getStreetName(),
                            addressDTO.getFlatNumber());

    }
}
