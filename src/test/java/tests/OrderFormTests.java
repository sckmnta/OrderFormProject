package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class OrderFormTests {
    @AfterAll
    static void afterAll(){
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void orderFormUITest() {
        open("https://bairon-sale.ru/");
        $("button.fancybox-button.fancybox-close-small").click();
        $("a.btn.btn-style-5.seo_callback_top_button").click();
        $$("input.form-control.js_dynamic_input").findBy(Condition.name("callback_form[name]")).setValue("Mehraba");
        $$("input.form-control.js_dynamic_input").findBy(Condition.name("callback_form[phone]")).setValue("112");
        $("button.btn.dark-btn").click();
    }

   /* @Test
    void executeJsTest() {
        open("https://bairon-sale.ru/");
        executeJavaScript("$('.div.Popup_Window Banner_Container.js_banner_content.fancybox-content').remove()");
    }*/
}
//todo move test to PO