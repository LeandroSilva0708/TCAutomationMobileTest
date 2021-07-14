package StepsDefinitions;

import cucumber.api.java.es.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import screens.LoginScreen;

public class LoginSteps {
    LoginScreen login;

    public LoginSteps() {

        login = new LoginScreen();
    }
    @Dado("^que estou na tela de login$")
    public void queEstouNaTelaDeLogin() {
    login.EstounoLogin();
    }

    @Quando("^informo um usuario valido$")
    public void informoumusuariovalido() {
        login.Logar();
    }

    @Entao("^vejo a tela Home$")
    public void vejoatelaHome() {
        login.estounahome();
    }

}
