# TestSelenium Documentation et Mode d'emploi

Script pour effectuer un test automatique 


---------------------------------------------------------------------------------------------------------------------------------------
****Documentation****

***Importer des packages/instructions*** : 
Tout d'abord nous avons besoin d'importer les deux pacquages suivants pour être prêt:

  org.openqa.selenium.* : fait référence à l'interface WebDriver requise pour instancier un nouveau navigateur Web

  org.openqa.selenium.chrome.ChromeDriver : fait référence à la classe chromeDriver requise pour instancier un pilote spécifique à Firefox   sur le navigateur utilisé par la classe WebDriver

***Instanciation d'objets et de variables*** : 
WebDriver driver = new ChromeDriver()

***Instructions complémentaires*** :
driver.manage().window().maximize() : On maximize la fenêtre ouvert par le script
driver.manage().deleteAllCookies() : on supprime les cookies
driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS) : on fixe un delai maximum pour charger une page
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS) : fait attendre l'exécution automatisée de la tâche pendant un certain temps avant de passer à l'étape suivante

***Localisation des éléments Web*** :
Nous utilisons les détecteurs dynamiques findElement (By.locator ()) pour localiser les éléments dans WebDriver 

On trouve les elements en inspectant le code source de la page web
  la méthode driver.findElement(By.name("q")) permet de choisir l'élément qu'on souhaite 
  la méthode sendKeys("arte boutique") permet d'entrer la valeur arte boutique dans l'élement
  la méthode click() permet de cliquer sur l'élement qu'on a trouvé
  
***Comparer les valeurs réelles et attendues*** :
Cette partie du code applique simplement un format Java if-else de base pour faire une comparaison entre l'url réel et l'url attendu.
    
    String current_url = driver.getCurrentUrl();
		String url = "https://boutique.arte.tv/";
		
		if (url.equals(current_url)) {
			System.out.println("Test Success");
			System.out.println("L'url de la page courante est " + current_url);
		}
		else 
			System.out.println("Test failure"); 
      
***Mettre fin à une session de navigateur*** :
La méthode quit () vous aide à fermer la fenêtre du navigateur

----------------------------------------------------------------------------------------------------------------------------------------


****Mode d'emploi****

Il existe deux manières d’exécuter le code dans Eclipse.

Dans la barre de menus Eclipse, choisissez Exécuter> Exécuter.
	-Appuyez sur Ctrl + F11 pour exécuter le code entier.
	-Exécuter sur la barre de menus Eclipse

Si vous avez tout complété correctement, Eclipse générera le message «Test réussi!».

Test réussi
----------------------------------------------------------------------------------------------------------------------------------------

