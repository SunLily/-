package com.qcloud;

import java.util.TreeMap;

import com.qcloud.QcloudApiModuleCenter;
import com.qcloud.Module.Cvm;
import com.qcloud.Utilities.Json.JSONObject;
import com.qcloud.cos.COSClient;
import com.qcloud.cos.ClientConfig;
import com.qcloud.cos.request.UploadFileRequest;
import com.qcloud.cos.sign.Credentials;

public class Demo {

	public static void main(String [] args){
		long appId = 1000000;
		String secretId = "AKIDeFi1CCK8IKDG8oxas4QsTxFSchaNHgBh";
		String secretKey = "oW4SeG9znSxSo03xfDTdfWJYfdQ6e0Rv";
		// 设置要操作的bucket
		String bucketName = "myphoto";
		// 初始化秘钥信息
		Credentials cred = new Credentials(appId, secretId, secretKey);

		// 初始化客户端配置
		ClientConfig clientConfig = new ClientConfig();
		// 设置bucket所在的区域，比如广州(gz), 天津(tj)
		clientConfig.setRegion("sh");
		// 初始化cosClient
		COSClient cosClient = new COSClient(clientConfig, cred);

//		String uploadFile(UploadFileRequest request);
		UploadFileRequest uploadFileRequest = new UploadFileRequest(bucketName, "/my_photo", "e:/test.txt");
		String uploadFileRet = cosClient.uploadFile(uploadFileRequest);
		System.out.println(uploadFileRet);
	}

}
