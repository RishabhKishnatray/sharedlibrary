package snaatak.template
import snaatak.common.*
def call(String repoUrl, String branchName){
  clone = new clone()

  clone.call(repoUrl, branchName)
}
