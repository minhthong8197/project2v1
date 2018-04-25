package project2v1.upfile;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.web.multipart.MultipartFile;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.ObjectMetadata;

public class AmazonService {
	AmazonS3 s3client;
	String accessKey = "AKIAJZRO52MJIFD7EJ5A";
	String secretKey = "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";
	String bucketName = "ccproject2nhom13";

	public void initAmazon() {
		AWSCredentials credentials = new BasicAWSCredentials(this.accessKey, this.secretKey);
		AWSStaticCredentialsProvider provider = new AWSStaticCredentialsProvider(credentials);
		AmazonS3ClientBuilder builder = AmazonS3ClientBuilder.standard();
		builder.withCredentials(provider);
		builder.withRegion(Regions.US_WEST_2);
		this.s3client = builder.build();
	}

	public void uploadFile(MultipartFile file) throws IOException {
		try (InputStream inp = file.getInputStream();
			) 
		{
			String fileName = file.getOriginalFilename();
			ObjectMetadata metaData = new ObjectMetadata();
			metaData.setContentType(file.getContentType());
			s3client.putObject(bucketName, fileName, inp, metaData);
		}
	}

	public AmazonService() {
		initAmazon();
	}

}
