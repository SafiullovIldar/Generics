package converter.impl;

import converter.Converter;
import dto.ManDTO;
import entity.Man;

public class ManDtoToMan implements Converter<Man, ManDTO> {

    private final AddressDtoToAddress dtoToAddress = new AddressDtoToAddress();

    @Override
    public Man convert(ManDTO manDTO) {
        return new Man(manDTO.getId(),
                manDTO.getName(),
                manDTO.getBirthDate(),
                dtoToAddress.convert(manDTO.getAddressDTO()));
    }
}
