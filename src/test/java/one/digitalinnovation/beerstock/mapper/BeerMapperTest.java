package one.digitalinnovation.beerstock.mapper;

import one.digitalinnovation.beerstock.dto.BeerDTO;
import one.digitalinnovation.beerstock.entity.Beer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Tiago Luiz Fernandes
 */
class BeerMapperTest {

    private final BeerMapper beerMapper = BeerMapper.INSTANCE;

    @Test
    void toModelNull() {
        Beer beer = beerMapper.toModel(null);

        assertNull(beer);

    }

    @Test
    void toModelNullAttributes() {

        BeerDTO beerDTO = BeerDTO.builder().build();
        beerDTO.setMax(null);
        beerDTO.setQuantity(null);

        Beer beer = beerMapper.toModel(beerDTO);

        assertEquals(0,beer.getMax());

        assertEquals(0,beer.getQuantity());

    }

    @Test
    void toDTONull() {
        BeerDTO beerDTO = beerMapper.toDTO(null);

        assertNull(beerDTO);
    }

}