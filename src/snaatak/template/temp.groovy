package snaatak.template
import snaatak.common.*
def call(String repoUrl, String branchName, String credentialsId){
  clone = new clone()

  clone.call(repoUrl, branchName, credentialsId)
}
