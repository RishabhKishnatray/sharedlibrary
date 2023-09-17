package snaatak.template
import snaatak.common.*
def call(String repoUrl, String branchName, String credentialId){
  Clone = new Clone()

  Clone.call(repoUrl, branchName, credentialId)
}
