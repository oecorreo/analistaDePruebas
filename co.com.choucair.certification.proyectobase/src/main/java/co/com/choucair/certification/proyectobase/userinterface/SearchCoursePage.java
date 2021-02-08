package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {

    public static final Target BUTTON_UC = Target.the("Selecciona Universidad Choucair").located(By.xpath("//div[@id='universidad']//strong"));

    public static final Target INPUT_COURSE = Target.the("Buscar el curso").located(By.id("coursesearchbox"));

    public static final Target BUTTON_GO = Target.the("Da click para buscar el curso").located(By.id("//button[@class='btn-secondary']"));

    public static final Target SELECT_COURSE = Target.the("Da click para buscar el curso").located(By.xpath("//h4[contains(text(),'Recursos Automatización Bancolombia')]"));

    public static final Target NAME_COURSE = Target.the("Da el nombre del curso").located(By.xpath("//h1[contains(text(),'Recursos Automatización Bancolombia')]"));

}
