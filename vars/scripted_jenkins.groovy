def gitdownload(repo)
{
  git "https://github.com/sitesh-bit/${repo}.git"
}
def mavenbuild()
{
  sh 'mvn package'
}
def deploytomcat(ip, context)
{
   "deploy adapters: [tomcat9(credentialsId: 'd03b691c-b1f9-467d-bd8b-c8fce3632959', path: '', url: 'http://${ip}:8080')], contextPath: '${context}', war: '**/*.war'"
}
