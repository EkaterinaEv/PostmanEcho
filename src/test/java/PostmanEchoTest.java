import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class PostmanEchoTest {
    @Test
    void test() {
        // Given - When - Then
// Предусловия
        given()
                .log().all()
                .baseUri("https://postman-echo.com")
                .body("some data") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
//                .body(/* --> ваша проверка здесь <-- */)
        ;
    }
}

//Изучите ответ и напишите JSONPath-выражение вместо строк /* --> ваша проверка здесь <--*/,
// которое проверит, что в нужном
// поле хранятся отправленные вами данные. Обратите внимание, теперь у вас не массив, а объект.
