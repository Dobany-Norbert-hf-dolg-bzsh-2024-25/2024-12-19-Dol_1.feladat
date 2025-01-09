/*
* File: Store.java
* Author: Sallai András
* Copyright: 2024, Sallai András
* Group: szit
* Date: 2024-12-15
* Github: https://github.com/oktat/
* Licenc: MIT
*
* Refactorer: Dobány Norbert
* Group: Szoft II/1/N
* Date: 2025-01-09
*/

public class Store 
{
    String username;   
    String password;
    String place;
    
    public Store(String username, String password, String place) 
    {
        this.username = username;
        this.password = password;
        this.place = place;
    }
        
    public String getPassword() {
        return this.password;
    }

    public String getUsername()
    {
        return this.username;
    }

    public String getPlace()
    {
        return this.place;
    }
    
    public boolean isPasswordEmpty() 
    {
        return this.password.isEmpty();
    }
}
