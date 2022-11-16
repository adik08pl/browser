package com.example.browser;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.web.WebView;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class HelloController {
    public Button btn3;
    public Button btn4;
    public Button btn2;
    public Button btn1;
    @FXML
    private WebView webView;
    List<String> fileContent;
    int btn1Txt;
    int btn2Txt;
    int btn3Txt;
    int btn4Txt;
    @FXML
    void initialize(){
        fileContent = FileHelper.loadFileContent("C:/cos/plikTekstowy.txt");
        System.out.println(fileContent.size());
        if (fileContent == null)
            return;
       btn1Txt =  fileContent.get(0).indexOf('+');
       btn2Txt =  fileContent.get(1).indexOf('+');
       btn3Txt =  fileContent.get(2).indexOf('+');
       btn4Txt =  fileContent.get(3).indexOf('+');
       btn1.setText(fileContent.get(0).substring(0,btn1Txt));
       btn2.setText(fileContent.get(1).substring(0,btn2Txt));
       btn3.setText(fileContent.get(2).substring(0,btn3Txt));
        btn4.setText(fileContent.get(3).substring(0,btn4Txt));
    }
    public void btn1clicked(ActionEvent actionEvent) {
        webView.getEngine().load(fileContent.get(0).substring(btn1Txt + 1));
        btn1.setDisable(true);
        btn2.setDisable(false);
        btn3.setDisable(false);
        btn4.setDisable(false);
    }
    public void btn2clicked(ActionEvent actionEvent) {
        webView.getEngine().load(fileContent.get(1).substring(btn2Txt + 1));
        btn1.setDisable(false);
        btn2.setDisable(true);
        btn3.setDisable(false);
        btn4.setDisable(false);
    }
    public void btn3clicked(ActionEvent actionEvent) {
        webView.getEngine().load(fileContent.get(2).substring(btn3Txt + 1));
        btn1.setDisable(false);
        btn2.setDisable(false);
        btn3.setDisable(true);
        btn4.setDisable(false);
    }
    public void btn4clicked(ActionEvent actionEvent) {
        webView.getEngine().load(fileContent.get(3).substring(btn4Txt + 1));
        btn1.setDisable(false);
        btn2.setDisable(false);
        btn3.setDisable(false);
        btn4.setDisable(true);
    }

}