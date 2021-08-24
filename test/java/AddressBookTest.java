import AddressBookModel.PersonInfo;
import AddressBookService.AddressBookService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

public class AddressBookTest {
    AddressBookService addressBookService;
    @BeforeEach
    public void setUp() throws Exception {
        addressBookService = new AddressBookService();
    }
    /**
     * Purpose : To test whether the number of records present in the database matches with the expected value
     */
    @Test
    void givenPersonInfoInDB_WhenRetrieved_ShouldMatchPersonCount() {
        List<PersonInfo> personInfoData = addressBookService.readPersonInfoData(AddressBookService.IOService.DB_IO);
        Assertions.assertEquals(4, personInfoData.size());

    }

    @Test
    void givenNewStateForPerson_WhenUpdated_ShouldSyncWithDB() {
        addressBookService.readPersonInfoData(AddressBookService.IOService.DB_IO);
        addressBookService.updatePersonInfo("Sayani", "West Bengal");
        boolean result = addressBookService.checkPersonInfoInSyncWithDB("Sayani");
        Assertions.assertTrue(result);
    }

    @Test
    void  givenDateRange_WhenRetrieved_ShouldMatchThePersonCount() {
        addressBookService.readPersonInfoData(AddressBookService.IOService.DB_IO);
        LocalDate startDate = LocalDate.of(2019, 01, 01);
        LocalDate endDate = LocalDate.now();
        List<PersonInfo> personInfoData = addressBookService.readPersonInfoForDateRange
                (AddressBookService.IOService.DB_IO, startDate, endDate);
        Assertions.assertEquals(3, personInfoData.size());
    }

    @Test
    void givenStateNameInDB_WhenRetrieved_ShouldMatchPersonCount() {
        addressBookService.readPersonInfoData(AddressBookService.IOService.DB_IO);
        List<PersonInfo> personInfoData = addressBookService.readPersonInfoForProvidedState
                (AddressBookService.IOService.DB_IO, "West Bengal");
        Assertions.assertEquals(2, personInfoData.size());
    }
}


