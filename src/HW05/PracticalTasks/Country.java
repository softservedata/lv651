package HW05.PracticalTasks;

import java.util.Locale;

public enum Country {
    AT("Austria", Continent.EUROPE, 43),
    BE("Belgium", Continent.EUROPE, 43),
    BG("Bulgaria", Continent.EUROPE, 359),
    HR("Croatia", Continent.EUROPE, 385),
    CY("Cyprus", Continent.EUROPE, 357),
    CZ("Czech Republic", Continent.EUROPE, 420),
    DK("Denmark", Continent.EUROPE, 45),
    EE("Estonia", Continent.EUROPE, 372),
    FI("Finland", Continent.EUROPE, 358),
    FR("France", Continent.EUROPE, 33),
    DE("Germany", Continent.EUROPE, 49),
    GR("Greece", Continent.EUROPE, 30),
    HU("Hungary", Continent.EUROPE, 36),
    IE("Ireland", Continent.EUROPE, 353),
    IT("Italy", Continent.EUROPE, 39),
    LV("Latvia", Continent.EUROPE, 371),
    LT("Lithuania", Continent.EUROPE, 370),
    LU("Luxembourg", Continent.EUROPE, 352),
    MT("Malta", Continent.EUROPE, 356),
    NL("Netherlands", Continent.EUROPE, 31),
    PL("Poland", Continent.EUROPE, 48),
    PT("Portugal", Continent.EUROPE, 351),
    RO("Romania", Continent.EUROPE, 40),
    SK("Slovakia", Continent.EUROPE, 421),
    SI("Slovenia", Continent.EUROPE, 386),
    ES("Spain", Continent.EUROPE, 34),
    SE("Sweden", Continent.EUROPE, 46),
    AL("Albania", Continent.EUROPE, 355),
    AD("Andorra", Continent.EUROPE, 376),
    AM("Armenia", Continent.EUROPE, 374),
    BY("Belarus", Continent.EUROPE, 375),
    BA("Bosnia and Herzegovina", Continent.EUROPE, 387),
    FO("Faroe Islands", Continent.EUROPE, 298),
    GE("Georgia", Continent.EUROPE, 995),
    GI("Gibraltar", Continent.EUROPE, 350),
    IS("Iceland", Continent.EUROPE, 354),
    IM("Isle of Man", Continent.EUROPE, 44),
    XK("Kosovo", Continent.EUROPE, 381),
    LI("Liechtenstein", Continent.EUROPE, 423),
    MK("Macedonia", Continent.EUROPE, 389),
    MD("Moldova", Continent.EUROPE, 373),
    MC("Monaco", Continent.EUROPE, 377),
    ME("Montenegro", Continent.EUROPE, 382),
    NO("Norway", Continent.EUROPE, 47),
    RU("Russian Federation", Continent.EUROPE, 7),
    SM("San Marino", Continent.EUROPE, 378),
    RS("Serbia", Continent.EUROPE, 381),
    CH("Switzerland", Continent.EUROPE, 41),
    TR("Turkey", Continent.EUROPE, 90),
    UA("Ukraine", Continent.EUROPE, 380),
    GB("United Kingdom", Continent.EUROPE, 44),
    VA("Vatican City State", Continent.EUROPE, 39),
    AI("Anguilla", Continent.NORTH_AMERICA, 0),
    AG("Antigua and Barbuda", Continent.NORTH_AMERICA, 0),
    AW("Aruba", Continent.NORTH_AMERICA, 0),
    BS("Bahamas", Continent.NORTH_AMERICA, 0),
    BB("Barbados", Continent.NORTH_AMERICA, 0),
    BZ("Belize", Continent.NORTH_AMERICA, 0),
    BM("Bermuda", Continent.NORTH_AMERICA, 0),
    BQ("Bonaire", Continent.NORTH_AMERICA, 0),
    VG("British Virgin Islands", Continent.NORTH_AMERICA, 0),
    CA("Canada", Continent.NORTH_AMERICA, 0),
    KY("Cayman Islands", Continent.NORTH_AMERICA, 0),
    CR("Costa Rica", Continent.NORTH_AMERICA, 0),
    CU("Cuba", Continent.NORTH_AMERICA, 0),
    CW("Curacao", Continent.NORTH_AMERICA, 0),
    DM("Dominica", Continent.NORTH_AMERICA, 0),
    DO("Dominican Republic", Continent.NORTH_AMERICA, 0),
    SV("Salvador El", Continent.NORTH_AMERICA, 0),
    GD("Grenada and Carriacuou", Continent.NORTH_AMERICA, 0),
    GL("Greenland", Continent.NORTH_AMERICA, 0),
    GP("Guadeloupe", Continent.NORTH_AMERICA, 0),
    GT("Guatemala", Continent.NORTH_AMERICA, 0),
    HT("Haiti", Continent.NORTH_AMERICA, 0),
    HN("Honduras", Continent.NORTH_AMERICA, 0),
    JM("Jamaica", Continent.NORTH_AMERICA, 0),
    MQ("Martinique", Continent.NORTH_AMERICA, 0),
    MX("Mexico", Continent.NORTH_AMERICA, 0),
    PM("Miquelon", Continent.NORTH_AMERICA, 0),
    MS("Montserrat", Continent.NORTH_AMERICA, 0),
    KN("Nevis", Continent.NORTH_AMERICA, 0),
    NI("Nicaragua", Continent.NORTH_AMERICA, 0),
    PA("Panama", Continent.NORTH_AMERICA, 0),
    PR("Puerto Rico", Continent.NORTH_AMERICA, 0),
    US("United States", Continent.NORTH_AMERICA, 0),
    AR("Argentina", Continent.SOUTH_AMERICA, 0),
    BO("Bolivia", Continent.SOUTH_AMERICA, 0),
    BR("Brazil", Continent.SOUTH_AMERICA, 0),
    CL("Chile", Continent.SOUTH_AMERICA, 0),
    CO("Colombia", Continent.SOUTH_AMERICA, 0),
    EC("Ecuador", Continent.SOUTH_AMERICA, 0),
    FK("Falkland Islands", Continent.SOUTH_AMERICA, 0),
    GF("French Guiana", Continent.SOUTH_AMERICA, 0),
    GY("Guiana", Continent.SOUTH_AMERICA, 0),
    PY("Paraguay", Continent.SOUTH_AMERICA, 0),
    PE("Peru", Continent.SOUTH_AMERICA, 0),
    VE("Venezuela", Continent.SOUTH_AMERICA, 0),
    Algeria("Algeria", Continent.AFRICA, 213),
    Angola("Angola", Continent.AFRICA, 244),
    Benin("Benin", Continent.AFRICA, 229),
    Botswana("Botswana", Continent.AFRICA, 267),
    Burundi("Burundi", Continent.AFRICA, 257),
    BurkinaFaso("Burkina Faso", Continent.AFRICA, 226),
    Cameroon("Cameroon", Continent.AFRICA, 237),
    CapeVerde("Cape Verde", Continent.AFRICA, 238),
    Chad("Chad", Continent.AFRICA, 235),
    Comoros("Comoros", Continent.AFRICA, 269),
    Cote_dIvoire("Cote d’Ivoire", Continent.AFRICA, 225),
    Congo("Congo", Continent.AFRICA, 243),
    Egypt("Egypt", Continent.AFRICA, 20),
    EquatorialGuinea("Equatorial Guinea", Continent.AFRICA, 240),
    CentralAfricanRepublic("Central African Republic", Continent.AFRICA, 236),
    Djibouti("Djibouti", Continent.AFRICA, 253),
    Ethiopia("Ethiopia", Continent.AFRICA, 251),
    Gabon("Gabon", Continent.AFRICA, 241),
    Gambia("Gambia", Continent.AFRICA, 220),
    Ghana("Ghana", Continent.AFRICA, 233),
    Guinea("Guinea", Continent.AFRICA, 224),
    Kenya("Kenya", Continent.AFRICA, 254),
    Lesotho("Lesotho", Continent.AFRICA, 266),
    Liberia("Liberia", Continent.AFRICA, 231),
    Libya("Libya", Continent.AFRICA, 218),
    Madagascar("Madagascar", Continent.AFRICA, 261),
    Malawi("Malawi", Continent.AFRICA, 265),
    Mali("Mali", Continent.AFRICA, 223),
    Mauritania("Mauritania", Continent.AFRICA, 222),
    Mauritius("Mauritius", Continent.AFRICA, 230),
    Morocco("Morocco", Continent.AFRICA, 212),
    Mozambique("Mozambique", Continent.AFRICA, 258),
    Namibia("Namibia", Continent.AFRICA, 264),
    Niger("Niger", Continent.AFRICA, 227),
    Nigeria("Nigeria", Continent.AFRICA, 234),
    Senegal("Senegal", Continent.AFRICA, 221),
    Somalia("Somalia", Continent.AFRICA, 252),
    Sudan("Sudan", Continent.AFRICA, 249),
    Tanzania("Tanzania", Continent.AFRICA, 255),
    Togo("Togo", Continent.AFRICA, 228),
    Uganda("Uganda", Continent.AFRICA, 256),
    Zambia("Zambia", Continent.AFRICA, 260),
    Zimbabwe("Zimbabwe", Continent.AFRICA, 263),
    Afghanistan("Afghanistan", Continent.ASIA, 93),
    Bahrain("Bahrain", Continent.ASIA, 973),
    Bangladesh("Bangladesh", Continent.ASIA, 880),
    Bhutan("Bhutan", Continent.ASIA, 975),
    Brunei("Brunei", Continent.ASIA, 673),
    Cambodia("Cambodia", Continent.ASIA, 855),
    China("China", Continent.ASIA, 86),
    India("India", Continent.ASIA, 91),
    Indonesia("Indonesia", Continent.ASIA, 62),
    Iran("Iran", Continent.ASIA, 98),
    Iraq("Iraq", Continent.ASIA, 964),
    Israel("Israel", Continent.ASIA, 972),
    Japan("Japan", Continent.ASIA, 81),
    Jordan("Jordan", Continent.ASIA, 962),
    Kazakhstan("Kazakhstan", Continent.ASIA, 7),
    Kuwait("Kuwait", Continent.ASIA, 965),
    Kyrgyzstan("Kyrgyzstan", Continent.ASIA, 996),
    Laos("Laos", Continent.ASIA, 856),
    Lebanon("Lebanon", Continent.ASIA, 961),
    Malaysia("Malaysia", Continent.ASIA, 60),
    Maldives("Maldives", Continent.ASIA, 960),
    Mongolia("Mongolia", Continent.ASIA, 976),
    Myanmar("Myanmar", Continent.ASIA, 95),
    Nepal("Nepal", Continent.ASIA, 977),
    NorthKorea("North Korea", Continent.ASIA, 850),
    Oman("Oman", Continent.ASIA, 968),
    Pakistan("Pakistan", Continent.ASIA, 92),
    Philippines("Philippines", Continent.ASIA, 63),
    Qatar("Qatar", Continent.ASIA, 974),
    SaudiArabia("Saudi Arabia", Continent.ASIA, 966),
    Singapore("Singapore", Continent.ASIA, 65),
    SouthKorea("South Korea", Continent.ASIA, 82),
    SriLanka("Sri Lanka", Continent.ASIA, 94),
    Palestine("State of Palestine", Continent.ASIA, 970),
    Syria("Syria", Continent.ASIA, 963),
    Taiwan("Taiwan", Continent.ASIA, 886),
    Tajikistan("Tajikistan", Continent.ASIA, 992),
    Thailand("Thailand", Continent.ASIA, 66),
    Turkmenistan("Turkmenistan", Continent.ASIA, 993),
    Emirates("United Arab Emirates", Continent.ASIA, 971),
    Uzbekistan("Uzbekistan", Continent.ASIA, 998),
    Vietnam("Vietnam", Continent.ASIA, 84),
    Yemen("Yemen", Continent.ASIA, 967);


    private final String name;
    private final Continent continent;
    private final int phoneCode;

    private static final Country[] country = Country.values();

    private Country(String name, Continent continent, int phoneCode) {
        this.name = name;
        this.continent = continent;
        this.phoneCode = phoneCode;
    }

    public String getName() {
        return name;
    }

    public static Continent getContinentByName(String name) {
        boolean findCountry = false;
        Continent result = Continent.UNDEFINED;
        for (int i = 0; i < country.length; i++) {
            if (country[i].name.toUpperCase().equals(name)) {
                result = country[i].continent;
                break;
            }
        }
        return result;
    }

    public static String printList(String name) {
        String result = "";
        for (int i = 0; i < country.length; i++) {
            if (country[i].name.toUpperCase().startsWith(name)) {
                result = result + country[i].name + " ";
            }
        }
        return result;
    }
}
