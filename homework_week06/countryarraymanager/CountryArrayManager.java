package countryarraymanager;

import java.util.ArrayList;

public class CountryArrayManager {
    private Country[] countries;
    private int length;
    private int increment;

    public CountryArrayManager() {
        this.increment = 10;
        countries = new Country[this.increment];
        this.length = 0;
    }

    public CountryArrayManager(int maxLength) {
        this.increment = 10;
        countries = new Country[maxLength];
        this.length = 0;
    }

    public int getLength() {
        return this.length;
    }

    public Country[] getCountries() {
        return this.countries;
    }

    private void correct() {
        int nullFirstIndex = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] == null) {
                nullFirstIndex = i;
                break;
            }
        }

        if (nullFirstIndex > 0) {
            this.length = nullFirstIndex;
            for (int i = nullFirstIndex; i < this.countries.length; i++) {
                this.countries[i] = null;
            }
        }
    }

    private void allocateMore() {
        Country[] newArray = new Country[this.countries.length + this.increment];
        System.arraycopy(this.countries, 0, newArray, 0, this.countries.length);
        this.countries = newArray;
    }

    public void append(Country country) {
        if (this.length >= this.countries.length) {
            allocateMore();
        }

        this.countries[this.length] = country;
        this.length++;
    }

    public boolean add(Country country, int index) {
        if ((index < 0) || (index > this.countries.length)) {
            return false;
        }

        if (this.length >= this.countries.length) {
            allocateMore();
        }

        for (int i = this.length; i > index; i--) {
            this.countries[i] = this.countries[i - 1];
        }

        this.countries[index] = country;
        this.length++;
        return true;
    }

    public boolean remove(int index) {
        if ((index < 0) || (index >= countries.length)) {
            return false;
        }

        for (int i = index; i < length - 1; i++) {
            this.countries[i] = this.countries[i + 1];
        }

        this.countries[this.length - 1] = null;
        this.length--;
        return true;
    }

    public Country countryAt(int index) {
        if ((index < 0) || (index >= this.length)) {
            return null;
        }

        return this.countries[index];
    }

    /**
     * Sort the countries in order of increasing population
     * using selection sort algorithm.
     *
     * @return array of increasing population countries.
     */
    public Country[] sortByIncreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < newArray.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[minIdx].getPopulation() > newArray[j].getPopulation()) {
                    minIdx = j;
                }
            }
            Country tmp = newArray[i];
            newArray[i] = newArray[minIdx];
            newArray[minIdx] = tmp;
        }

        return newArray;
    }

    /**
     * Sort the countries in order of decreasing population
     * using selection sort algorithm.
     *
     * @return array of decreasing population countries.
     */
    public Country[] sortByDecreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < newArray.length - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[maxIdx].getPopulation() < newArray[j].getPopulation()) {
                    maxIdx = j;
                }
            }
            Country tmp = newArray[i];
            newArray[i] = newArray[maxIdx];
            newArray[maxIdx] = tmp;
        }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing area
     * using bubble sort algorithm.
     *
     * @return array of increasing area countries.
     */
    public Country[] sortByIncreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        int n = newArray.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; ++i) {
                if (newArray[i - 1].getArea() > newArray[i].getArea()) {
                    Country temp = newArray[i];
                    newArray[i] = newArray[i - 1];
                    newArray[i - 1] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);

        return newArray;
    }

    /**
     * Sort the countries in order of decreasing area
     * using bubble sort algorithm.
     *
     * @return array of increasing area countries.
     */
    public Country[] sortByDecreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        int n = newArray.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; ++i) {
                if (newArray[i - 1].getArea() < newArray[i].getArea()) {
                    Country temp = newArray[i];
                    newArray[i] = newArray[i - 1];
                    newArray[i - 1] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);

        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     * using insertion sort algorithm.
     *
     * @return array of increasing GDP countries.
     */
    public Country[] sortByIncreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 1; i < newArray.length; i++) {
            Country key = newArray[i];
            int j = i - 1;
            while (j >= 0 && newArray[j].getGdp() > key.getGdp()) {
                newArray[j + 1] = newArray[j];
                j--;
            }
            newArray[j + 1] = key;
        }


        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     * using insertion sort algorithm.
     *
     * @return array of increasing insertion countries.
     */
    public Country[] sortByDecreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 1; i < newArray.length; i++) {
            Country key = newArray[i];
            int j = i - 1;
            while (j >= 0 && newArray[j].getGdp() < key.getGdp()) {
                newArray[j + 1] = newArray[j];
                j--;
            }
            newArray[j + 1] = key;
        }

        return newArray;
    }

    public AfricaCountry[] filterAfricaCountry() {
        ArrayList<AfricaCountry> africaCountries = new ArrayList<>();
        for (Country country : this.countries) {
            if (country instanceof AfricaCountry) {
                africaCountries.add((AfricaCountry) country);
            }
        }
        AfricaCountry[] africaCountries1 = new AfricaCountry[africaCountries.size()];
        return africaCountries.toArray(africaCountries1);
    }

    public AsiaCountry[] filterAsiaCountry() {
        ArrayList<AsiaCountry> asiaCountries = new ArrayList<>();
        for (Country country : this.countries) {
            if (country instanceof AsiaCountry) {
                asiaCountries.add((AsiaCountry) country);
            }
        }
        AsiaCountry[] asiaCountries1 = new AsiaCountry[asiaCountries.size()];
        return asiaCountries.toArray(asiaCountries1);
    }

    public EuropeCountry[] filterEuropeCountry() {
        ArrayList<EuropeCountry> europeCountries = new ArrayList<>();
        for (Country country : this.countries) {
            if (country instanceof EuropeCountry) {
                europeCountries.add((EuropeCountry) country);
            }
        }
        EuropeCountry[] europeCountries1 = new EuropeCountry[europeCountries.size()];
        return europeCountries.toArray(europeCountries1);
    }

    public NorthAmericaCountry[] filterNorthAmericaCountry() {
        ArrayList<NorthAmericaCountry> northAmericaCountries = new ArrayList<>();
        for (Country country : this.countries) {
            if (country instanceof NorthAmericaCountry) {
                northAmericaCountries.add((NorthAmericaCountry) country);
            }
        }
        NorthAmericaCountry[] northAmericaCountries1 = new NorthAmericaCountry[northAmericaCountries.size()];
        return northAmericaCountries.toArray(northAmericaCountries1);
    }

    public OceaniaCountry[] filterOceaniaCountry() {
        ArrayList<OceaniaCountry> oceaniaCountries = new ArrayList<>();
        for (Country country : this.countries) {
            if (country instanceof OceaniaCountry) {
                oceaniaCountries.add((OceaniaCountry) country);
            }
        }
        OceaniaCountry[] oceaniaCountries1 = new OceaniaCountry[oceaniaCountries.size()];
        return oceaniaCountries.toArray(oceaniaCountries1);
    }

    public SouthAmericaCountry[] filterSouthAmericaCountry() {
        ArrayList<SouthAmericaCountry> southAmericaCountries = new ArrayList<>();
        for (Country country : this.countries) {
            if (country instanceof SouthAmericaCountry) {
                southAmericaCountries.add((SouthAmericaCountry) country);
            }
        }
        SouthAmericaCountry[] southAmericaCountries1 = new SouthAmericaCountry[southAmericaCountries.size()];
        return southAmericaCountries.toArray(southAmericaCountries1);
    }

    public Country[] filterMostPopulousCountries(int howMany) {
        Country[] res = new Country[howMany];
        Country[] sortedArr = sortByDecreasingGdp();
        System.arraycopy(sortedArr, 0, res, 0, howMany);
        return res;
    }

    public Country[] filterLeastPopulousCountries(int howMany) {
        Country[] res = new Country[howMany];
        Country[] sortedArr = sortByIncreasingPopulation();
        System.arraycopy(sortedArr, 0, res, 0, howMany);
        return res;
    }

    public Country[] filterLargestAreaCountries(int howMany) {
        Country[] res = new Country[howMany];
        Country[] sortedArr = sortByDecreasingArea();
        System.arraycopy(sortedArr, 0, res, 0, howMany);
        return res;
    }

    public Country[] filterSmallestAreaCountries(int howMany) {
        Country[] res = new Country[howMany];
        Country[] sortedArr = sortByIncreasingArea();
        System.arraycopy(sortedArr, 0, res, 0, howMany);
        return res;
    }

    public Country[] filterHighestGdpCountries(int howMany) {
        Country[] res = new Country[howMany];
        Country[] sortedArr = sortByDecreasingGdp();
        System.arraycopy(sortedArr, 0, res, 0, howMany);
        return res;
    }

    public Country[] filterLowestGdpCountries(int howMany) {
        Country[] res = new Country[howMany];
        Country[] sortedArr = sortByIncreasingGdp();
        System.arraycopy(sortedArr, 0, res, 0, howMany);
        return res;
    }

    public static String codeOfCountriesToString(Country[] countries) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                codeOfCountries.append(country.getCode())
                        .append(" ");
            }
        }

        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(Country[] countries) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                countriesString.append(country.toString()).append("\n");
            }
        }
        System.out.print(countriesString.toString().trim() + "]");
    }
}
