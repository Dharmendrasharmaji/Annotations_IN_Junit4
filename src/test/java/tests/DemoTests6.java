package tests;

import org.junit.Assert;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class DemoTests6 {
    @ClassRule
    public static TemporaryFolder tmpFolder = TemporaryFolder.builder().assureDeletion().build();

    @Test
    public void shouldCreateNewFileInTemporaryFolder() throws IOException {
        File created = tmpFolder.newFile("file.txt");

        Assert.assertTrue(created.isFile());

        System.out.println(tmpFolder.getRoot()+" ----  "+created.getParentFile() );

        Assert.assertEquals(tmpFolder.getRoot(), created.getParentFile());

        System.out.println(Arrays.stream(tmpFolder.getRoot().list()).findAny() );

    }

    @Test
    public void checkFile(){
        System.out.println("\n----------------------------\n");
        System.out.println(Arrays.stream(tmpFolder.getRoot().list()).findAny());
        Assert.assertFalse(Arrays.stream(tmpFolder.getRoot().list()).findAny().isEmpty());

    }
}
