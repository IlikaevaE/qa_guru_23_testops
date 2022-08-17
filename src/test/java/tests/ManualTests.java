package tests;

import io.qameta.allure.AllureId;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;


public class ManualTests {

    @Test
    @AllureId("11908")
    @DisplayName("Авторизация через Google")
    void allureExampleTests() {
        step("Открываем главную страницу");
        step("Авторизуемся как пользователь Elena Ilikaeva", () -> {
            step("Вводим логин e.ilikaeva@gmail.com");
            step("Вводим пароль 123456");
            step("Нажимаем кнопку Войти ");
        });
        step("Проверяем, что авторизовались правильно", () -> {
            step("В правом верхнем углу видим имя пользователя");
        });
        step("Проверяем, что данные профиля обновились из Google  ", () -> {
            step("Имя пользователя Elena Ilikaeva ");
            step("Почта: e.ilikaeva@gmail.com");
            step("Аватарка");
        });
    }
}
