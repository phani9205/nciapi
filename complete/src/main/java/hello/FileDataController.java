package hello;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import service.FileToJSON;

@RestController
public class FileDataController {


    @RequestMapping(value= "/readFile",method = RequestMethod.POST)
    public List<FileData> fileData(@RequestParam(value="file") MultipartFile file) {
        FileToJSON fileToJSON =  new FileToJSON();
        List<FileData> result =  fileToJSON.prepareJSON(file);
        return result;
    }
}
