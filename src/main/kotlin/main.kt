import io.nayuki.qrcodegen.QrCode
import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO

fun main(args: Array<String>) {
    //FOREACH
    for (i in 1..204) {
        var codigo: String = "$i"
        var qr = QrCode.encodeText(codigo, QrCode.Ecc.HIGH)
        var img: BufferedImage = qr.toImage(4, 10)
        ImageIO.write(img, "png", File("./QR/$codigo.png"));
    }

}