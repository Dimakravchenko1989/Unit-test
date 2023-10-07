package seminars.fourth.database;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class DataProcessorTest {
    private Database database;
    private DataProcessor dataProcessor;
    @Before
    public void setUp() {
        database = mock(Database.class);
        dataProcessor = new DataProcessor(database);
    }
    @Test
    public void testProcessData() {
        String sql = "SELECT * FROM table";

        List<String> fakeData = new ArrayList<>();
        fakeData.add("Data1");
        fakeData.add("Data2");
        fakeData.add("Data3");

        when(database.query(sql)).thenReturn(fakeData);
        List<String> result = dataProcessor.processData(sql);
        verify(database).query(sql);
        assertEquals(fakeData, result);
    }
}