class BasePage {
    constructor(browser) {
        this.browser = browser;
    }

    navigate(url) {
        console.log(`Navigating to ${url} using ${this.browser}`);
    }
}

class LoginPage extends BasePage {
    constructor(browser) {
        super(browser);
        this.usernameField = 'input#username';
        this.passwordField = 'input#password';
    }

    login(username, password) {
        console.log(`Logging in as ${username}`);
    }
}

const page = new LoginPage('Chrome');
page.navigate('httos://saucedemo.com');
page.login('standard_user', 'secret_sauce');