package htmlpublisher;

import hudson.FilePath;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

/**
 * @author: lkleen
 * @since: 1.1.1
 */
public class FilePathTest {

    @Test
    public void testFilePath() throws Exception {
        FilePath baseDir = new FilePath(new File("."));
        FilePath srcDir = new FilePath(baseDir, "src");
        assertTrue(srcDir.exists());
        assertTrue(srcDir.isDirectory());
    }

}
