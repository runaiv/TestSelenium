package selenium;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * Test automatique pour vérifier lorsqu'on tape "arte france" sur 
 * la barre de recherche de google et ensuite, lors du click sur le bouton "J'ai de la chance" 
 * On est dirigé bien vers la page "https://boutique.arte.tv/"
 *
 * 
 * @author Arun
 *
 */
 
public class First_Test {
	
	/**
	 * 
	 * @param args
	 * @throws InterruptedException
	 */
	
	public static void main(String[] args) throws InterruptedException{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\selenium\\chromedriver.exe");
		
		
		//Créer une nouvelle instance du pilote chrome
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Naviguer sur google
		driver.get("https://google.com/");
		
		//Trouver la boite de recherhce et entrer le nom
		driver.findElement(By.name("q")).sendKeys("arte boutique");
		
		//Trouver le bouton "j'ai de la chance" et cliquer
		driver.findElement(By.name("btnI")).click();
		
		//Vérifier l'url courant
		String current_url = driver.getCurrentUrl();
		String url = "https://boutique.arte.tv/";
		
		if (url.equals(current_url)) {
			System.out.println("Test Success");
			System.out.println("L'url de la page courante est " + current_url);
		}
		else 
			System.out.println("Test failure");
		
		//Fermer chrome driver
		driver.quit();
	} 
}	