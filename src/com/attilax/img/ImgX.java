/**
 * 
 */
package com.attilax.img;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.Thumbnails.Builder;
import net.coobird.thumbnailator.geometry.Positions;

/**
 * @author ASIMO
 * 
 */
public class ImgX {

	/**
	 * @author attilax 老哇的爪子
	 * @since p2c m_37_52
	 */
	public static void main(String[] args) {
		String f = thumb("");

	}

	/**
	 * @author attilax 老哇的爪子
	 * @throws IOException
	 * @since p2c m_38_i
	 */
	private static String thumb(String imagePath) {

		// String imagePath = "F:\\image\\IMG_20131229_114806.jpg";
		BufferedImage image;
		try {
			image = ImageIO.read(new File(imagePath));

			Builder<BufferedImage> builder = null;

			int imageWidth = image.getWidth();
			int imageHeitht = image.getHeight();
			int height = 300;
			int width = 400;
			if ((float) height / width != (float) imageWidth / imageHeitht) {
				if (imageWidth > imageHeitht) {
					image = Thumbnails.of(imagePath).height(height)
							.asBufferedImage();
				} else {
					image = Thumbnails.of(imagePath).width(width)
							.asBufferedImage();
				}
				builder = Thumbnails.of(image)
						.sourceRegion(Positions.CENTER, width, height)
						.size(width, height);
			} else {
				builder = Thumbnails.of(image).size(width, height);
			}
			builder.outputFormat("jpg").toFile(
					"F:\\image\\output\\IMG_20131229_114806");
			return null;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

}
