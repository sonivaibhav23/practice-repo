package vaibhav.practice.repo.mockitoexample;

public class SomeBusinessImpl {

    private DataService dataService;

    public SomeBusinessImpl(DataService dataService) {
        this.dataService = dataService;
    }

    int findTheGreatestFromAllData() {
        int [] numbers = dataService.retrieveAllData();
        int greatest = Integer.MIN_VALUE;

        for (int item : numbers) {
            if(item > greatest) {
                greatest = item;
            }
        }

        return greatest;
    }
}



