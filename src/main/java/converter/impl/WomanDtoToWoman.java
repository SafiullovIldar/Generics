package converter.impl;

import converter.Converter;
import dto.WomanDTO;
import entity.Woman;

public class WomanDtoToWoman implements Converter<Woman, WomanDTO> {

    private final AddressDtoToAddress dtoToAddress = new AddressDtoToAddress();

    @Override
    public Woman convert(WomanDTO womanDTO) {
        return new Woman(womanDTO.getId(),
                womanDTO.getName(),
                womanDTO.getBirthDate(),
                dtoToAddress.convert(womanDTO.getAddressDTO()));
    }
}
