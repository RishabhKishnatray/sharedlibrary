package snaatak.template
import snaatak.common.*
def call(String repoUrl, String branchName, String credentialsId){
  Clone = new Clone()

  Clone.call(repoUrl, branchName, credentialId)
}
