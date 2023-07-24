package ke.co.safaricom;

import ke.co.safaricom.dao.StrengthDao;
import ke.co.safaricom.dao.WeaknessDao;
import ke.co.safaricom.model.Strength;
import ke.co.safaricom.model.Weakness;

public class Main {
    public static void main(String[] args) {
        Strength strength = new Strength();
        strength.setName( "TEST" );
        strength.setScore( 5 );
        System.out.println( strength );
        StrengthDao.create( strength );

        Weakness weakness = new Weakness();
        weakness.setName( "coward" );
        weakness.setScore( 8 );
        System.out.println( weakness );
        WeaknessDao.create( weakness );

    }

}



