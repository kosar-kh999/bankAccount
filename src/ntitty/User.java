package ntitty;

import java.util.ArrayList;
import java.util.List;

public class User {
    List<Account> accountList = new ArrayList<>();
    private String name;
    private String family;
    private String nationalCode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        if (nationalCode.length() == 10){
            this.nationalCode = nationalCode;
        }
    }
}
