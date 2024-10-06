
package animal;

/**
 *
 * @author dondull
 */
public class Horse extends Animal {
    private String mau_long_mao;

    public Horse() {
    }
    public Horse(String mau_long_mao){
        this.mau_long_mao = mau_long_mao;
    }
     
    public void setMau_long_mao(String mau_long_mao){
        this.mau_long_mao = mau_long_mao;
        
    }
    
    public String getMau_long_mao(){
        return mau_long_mao;
    }
     
}