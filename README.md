# TestShowImageTwo

## 簡介
這隻簡單 Eclipse 小專案，  
主要是在練習使用 Java AWT、Swing API製作一個GUI視窗程式。  
這邊用到 Object父類別 預設就有的 getClass()方法，  
再用getClass()方法 呼叫 getResource()方法，  
並在 getClass()方法 傳入 以編譯出來的.class檔案【bytecode】為起始位置 『.』 的 『圖片相對路徑』。  
getClass().getResource("./xxxImage") 如果成功抓取到圖片檔案會回傳 java.net.URL物件，  
接著把 java.net.URL物件 傳入 javax.swing.ImageIcon建構子，  
就能成功建構出圖片物件，把圖秀出來。  

要特別注意的地方是，  
使用此種方法時，『圖片檔』、『音樂檔」等相關資源必須放置在跟 .class檔案 同一層位置的資料夾裡面，  
並且此種方法無法成功讀取BMP格式圖檔，  
如果每次專案重新 clean and build ，  
編譯後放置 .class檔案 的資料夾會被重設，只剩下 .calss檔案，  
圖片等相關其餘資源檔案會被刪除。  
使用 getClass().getResource() 限制非常多，使用上也很不方便。  

## 開發環境
IDE：Eclipse Java EE IDE for Web Developers.  
IDE version：2018-09 (4.9.0)  
程式語言：Java  
jdk version：1.8.0_202  
電腦作業系統：Windows 10家用版  
電腦作業系統版本：21H1  
電腦系統類型：64 位元作業系統，x64 型處理器  

## 執行程式方法  
點擊 open.bat 滑鼠右鍵 -> [開啟(O)] 打開目錄位於此專案根目錄的命令提示字元。  
接著輸入 run.bat 開始 編譯 執行程式，以及把圖片檔案複製一份到.class檔案的位置。  
程式關掉後。輸入 exit 關閉命令提示字元。  
