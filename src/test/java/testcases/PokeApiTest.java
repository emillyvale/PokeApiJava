package testcases;

import org.testng.annotations.Test;
import utils.BaseTest;

import static io.restassured.RestAssured.given;

public class PokeApiTest extends BaseTest {

    @Test(description = "Pesquisar Pokemom")
    public void validaBuscaDePokemom() {
        given().
                spec(spec).
                when().
                get("pokemon/1").
                then().
                assertThat().
                statusCode(200);

    }



}
