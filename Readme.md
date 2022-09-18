# Build and Upload
choose "active" function in application.yml

mvn clean install

create a role in aws IAM with permission "AWSLambdaBasicExecutionRole".

copy the "arn" of the created role and use it as role-argument in the following "create function" command

### create function
``
aws lambda create-function --function-name reverse-text --role arn:aws:iam::[USER_ID]:role/[ROLE] --zip-file fileb://target/spring-cloud-function-aws-lambda-1.0-SNAPSHOT-aws.jar --handler org.springframework.cloud.function.adapter.aws.FunctionInvoker::handleRequest --description "Spring Cloud Function Adapter Example" --runtime java11 --region eu-central-1 --timeout 20 --memory-size 512 --publish
``

### delete function
``
aws lambda delete-function --function-name reverse-text --region eu-central-1
``

### update function
``
aws lambda update-function-code --function-name reverse-text --zip-file fileb://target/spring-cloud-function-aws-lambda-1.0-SNAPSHOT-aws.jar --region eu-central-1
``
