package snaatak.template
import snaatak.common.*
def call(String repoUrl, String credentialsId, String branchName){
  clone = new clone()

  clone.call(repoUrl, credentialsId, branchName)
}
