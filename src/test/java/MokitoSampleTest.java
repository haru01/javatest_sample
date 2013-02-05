import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

// http://docs.mockito.googlecode.com/hg/latest/org/mockito/Mockito.html
@SuppressWarnings("unchecked")
public class MokitoSampleTest {

    @Test
    public void Lets_verify_some_behavior() {
        List mockedList = mock(List.class);

        // sut
        mockedList.add("one");
        mockedList.clear();

        // expected
        verify(mockedList).add("one");
        verify(mockedList).clear();
    }

    @Test
    public void Sutbbing() {
        LinkedList<String> stubedList = mock(LinkedList.class);

        when(stubedList.get(0)).thenReturn("first");

        assertThat(stubedList.get(0), equalTo("first"));
    }

    @Test
    public void SutbbingNotStubId999() {
        LinkedList<String> stubedList = mock(LinkedList.class);
        assertThat(stubedList.get(999), is(nullValue()));
    }

    @Test(expected=RuntimeException.class)
    public void SutbbingThrowException() {
        LinkedList<String> stubedList = mock(LinkedList.class);

        when(stubedList.get(1)).thenThrow(new RuntimeException());

        stubedList.get(1);
    }

}
